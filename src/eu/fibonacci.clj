(ns eu.fibonacci)

(defn fib-sequence []
  "lazy-seq representing the fibonacci sequence"
  ((fn fib-recur [a b]
     (cons a
           (lazy-seq (fib-recur b (+ a b))))) 0 1))

(defn fib [n]
  "takes n elements of the fibonacci sequence"
  (take n (fib-sequence)))

(defn fib-less-than [x]
  "takes the fibonacci sequence up to x"
  (take-while #(< % x) (fib-sequence)))