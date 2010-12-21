(ns eu.core)

(defn divisible? [x, divisor]
  (= 0 (rem x divisor)))

(defn fib-sequence []
  ((fn fib-recur [a b]
     (cons a (lazy-seq (fib-recur b (+ a b))))) 0 1))

(defn fib [n]
  (take n (fib-sequence)))

(defn fib-less-than [x]
  (take-while (fn [n]
                (< n x)) (fib-sequence)))
