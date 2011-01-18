(ns eu.core
  (:use [math.core]))

(defn seq-upto [n]
  (take n (iterate inc 1)))

(defn palindrome? [s]
  (cond
    (or (= 0 (.length (str s)))
        (= 1 (.length (str s))))
      true
    (= (first (str s))
       (last (str s)))
      (palindrome? (subs (str s)
                         1
                         (- (.length (str s)) 1)))
    :else
      false))

