(ns eu.euler004
  (:use eu.core))

(defn palindromes-from-product [x y]
  (distinct
    (remove nil?
      (for [a (range x (+ 1 y))
            b (range x (+ 1 y))]
        (if (palindrome? (* a b))
          (* a b))))))

(defn euler004 [x y]
  (greatest (palindromes-from-product x y)))

(defn solution []
  (euler004 100 999))
