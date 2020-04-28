package com.n4k3.abstractdocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Document interface
 * その場で新しいプロパティを追加する必要がある
 * 構造ツリーでドメインを整理する柔軟な方法がほしい
 * より疎結合なシステムが欲しい
 */
public interface Document {

    /**
     * キーに関連する値を代入
     *
     * @param key キー
     * @param value 値
     * @return Void
     */
    Void put(String key, Object value);

    /**
     * キーに関連する値を取得
     *
     * @param key キー
     * @return 値 or null
     */
    Object get(String key);

    /**
     * 子ドキュメントのストリームを取得
     *
     * @param key キー
     * @param constructor 子クラスのコンストラクタ
     * @return 子ドキュメント
     */
    <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);
}
