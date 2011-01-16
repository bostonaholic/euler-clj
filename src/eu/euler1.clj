(ns eu.euler1
  (:use eu.core))

(defn mod3or5 [x]
  (or (divisible? x 3)
      (divisible? x 5)))

(defn euler1 [n]
  (reduce + (filter mod3or5 (range 1 n))))

(defn solution []
  (euler1 1000))
