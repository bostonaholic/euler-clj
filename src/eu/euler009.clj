(ns eu.euler009
  (:use eu.math))

(defn pyth-triplet? [a b c]
  (and (< a b c)
       (= (+ (square a) (square b)) (square c))))

(defn sum-of-pyth-triplet [a b c] 
  (+ a b c))

(defn euler009 [n]
  (= n (sum-of-pyth-triplet)))

(defn solution []
  (euler009 1000))
