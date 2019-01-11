(ns roaring.bitmap
  (:import [org.roaringbitmap RoaringBitmap]))


(defn make [coll]
  (let [bm (new RoaringBitmap)]
    (doall (map #(.add bm %) coll))
    bm))

(defn set! [bm idx]
  (.add bm idx)
  bm)

(defn or [rr1 rr2]
  (RoaringBitmap/or rr1 rr2))

(defn inplace-or [receiver-rr rr2]
  (.or receiver-rr rr2))

(defn and [rr1 rr2]
  (RoaringBitmap/and rr1 rr2))

(defn inplace-and [receiver-rr rr2]
  (.and receiver-rr rr2))

(defn cardinality [bm]
  (-> bm .getLongCardinality))
