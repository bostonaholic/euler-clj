(ns math.fibonacci
  (:use [math.core]))

(defn fib-sequence []
  ((fn fib-recur [a b]
     (cons a
           (lazy-seq (fib-recur b (+ a b))))) 0 1))

(defn fib [n]
  (take n (fib-sequence)))

(defn fib-less-than [x]
  (take-while
    (fn [y]
      (< y x)) (fib-sequence)))

