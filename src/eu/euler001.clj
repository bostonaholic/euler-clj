(ns eu.euler001
  (:require [eu.math :refer [divisible?]]))

(defn mod3or5 [x]
  (or (divisible? x 3)
      (divisible? x 5)))

(defn euler001 [n]
  (reduce + (filter mod3or5 (range 1 n))))

(defn solution []
  (euler001 1000))
