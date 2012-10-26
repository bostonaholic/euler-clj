(ns eu.euler009
  (:use eu.math))

(defn pyth-triplet? [[a b c]]
  (and (< a b c)
       (= (+ (square a) (square b))
          (square c))))

(defn pyth-triplets [max]
  (filter pyth-triplet?
          (for [a (range 3 (inc max))
                b (range a (inc max))
                c (range b (inc max))
                :while (<= (+ a b c) max)]
            [a b c])))

(defn pyth-eq? [triplet n]
  (let [[a b c] triplet]
    (= (+ a b c) n)))

(defn pyth-triplets-for-max [n]
  (filter #(pyth-eq? % n) (pyth-triplets n)))

(defn euler009 [n]
  (apply * (pyth-triplets-for-max n)))

(defn solution []
  (euler009 1000))
