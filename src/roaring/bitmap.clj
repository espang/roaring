(ns roaring.bitmap
  (:import [org.roaringbitmap RoaringBitmap]))


(defn make [coll]
  (let [bm (new RoaringBitmap)]
    (map #(.add bm %) coll)
    bm))

(defn set! [bm idx]
  (.add bm idx)
  bm)

(defn cardinality [bm]
  (-> bm .getLongCardinality))
