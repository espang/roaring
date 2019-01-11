(ns roaring.bitmap-test
  (:require [clojure.test :refer :all]
            [roaring.bitmap :refer :all]))

(deftest a-test
  (= 4 (cardinality (make [1 2 3 4]))))
