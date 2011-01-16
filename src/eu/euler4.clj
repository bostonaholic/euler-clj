(ns eu.euler4
  (:use eu.core))

(defn palindromes-from-product [x y]
  (distinct
    (remove nil?
      (for [a (range x (+ 1 y))
            b (range x (+ 1 y))]
        (if (palindrome? (* a b))
          (* a b))))))

(defn euler4 [x y]
  (largest (palindromes-from-product x y)))

(defn solution []
  (euler4 100 999))
