(ns eu.euler6
  (:use eu.core))

(defn sum-of-squares [n]
  (reduce + (map square (seq-upto n))))

(defn square-of-sums [n]
  (square (reduce + (seq-upto n))))

(defn euler6 [n]
  (- (square-of-sums n) (sum-of-squares n)))
