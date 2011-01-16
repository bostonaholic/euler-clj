(ns eu.euler006
  (:use eu.core))

(defn sum-of-squares [n]
  (reduce + (map square (seq-upto n))))

(defn square-of-sums [n]
  (square (reduce + (seq-upto n))))

(defn euler006 [n]
  (- (square-of-sums n) (sum-of-squares n)))

(defn solution []
  (euler006 100))
