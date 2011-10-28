(ns eu.euler006
  (:use eu.core
        eu.math))

(defn sum-of-squares [n]
  (reduce + (map square (to (+ n 1)))))

(defn square-of-sums [n]
  (square (reduce + (to (+ n 1)))))

(defn euler006 [n]
  ;((- square-of-sums sum-of-squares) n))
  (- (square-of-sums n) (sum-of-squares n)))

(defn solution []
  (euler006 100))
