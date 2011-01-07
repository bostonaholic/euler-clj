(ns eu.euler4
  (:use eu.core))

(defn palindromes-from-product [x y]
  (remove nil? 
    (for [a (range 1 (+ 1 x))
          b (range 1 (+ 1 y))]
      (if (palindrome? (* a b))
        (* a b)))))

(defn euler4 [x y]
  (last (sort (palindromes-from-product x y))))
