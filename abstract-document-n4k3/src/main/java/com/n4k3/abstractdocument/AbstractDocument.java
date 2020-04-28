package com.n4k3.abstractdocument;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Abstract implementation of Document interface
 * 抽象ドキュメントパターンを使用すると、開発者は構成設定などの変数を型なしツリー構造に格納し、
 * 型付きビューを使用してドキュメントを操作できます。
 * 内部のドキュメント構造に影響を与えることなく、新しいビューまたはビューの代替実装を作成できます。
 * これの利点は、システムの疎結合性が高くなることですが、
 * プロパティの継承タイプが常に確実であるとは限らないため、エラーをキャストするリスクが高まります。
 */
public abstract class AbstractDocument implements Document {

    private final Map<String, Object> properties;

    protected AbstractDocument(Map<String, Object> properties) {
        Objects.requireNonNull(properties, "properties map is required");
        this.properties = properties;
    }

    @Override
    public Void put(String key, Object value) {
        properties.put(key, value);
        return null;
    }

    @Override
    public Object get(String key) {
        return properties.get(key);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
        return Stream.ofNullable(get(key)) // 取得した値がNull値の場合、空のStream作成
                .filter(Objects::nonNull) // get(key)がnullかを検査
                .map(el -> (List<Map<String, Object>>) el) // 保持している値を変換する（値を変更した新しいStreamを返す）。戻り値：Stream<R>
                .findAny() // 任意の値を返す Optional
                .stream() // ストリーム
                .flatMap(Collection::stream) // 複数の値（0個も可）に変換するmapメソッド。戻り値： Stream<R>
                .map(constructor); // 保持している値を変換する（値を変更した新しいStreamを返す）。戻り値：Stream<R>
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append(getClass().getName()).append("[");
        properties.forEach((key, value) -> builder.append("[").append(key).append(" : ").append(value).append("]"));
        builder.append("]");
        return builder.toString();
    }

}
