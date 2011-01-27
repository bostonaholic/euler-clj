(ns eu.euler006
  (:use [eu.core]
        [math.core]
        [math.iota]))

(defn sum-of-squares [n]
  (reduce + (map square (to (+ n 1)))))

(defn square-of-sums [n]
  (square (reduce + (to (+ n 1)))))

(defn euler006 [n]
  (- (square-of-sums n) (sum-of-squares n)))

(defn solution []
  (euler006 100))
