(ns eu.euler002)

(defn fib-sequence []
  ((fn fib-recur [a b]
     (cons a
           (lazy-seq (fib-recur b (+ a b))))) 0 1))

(defn fib [n]
  (take n (fib-sequence)))

(defn fib-less-than [x]
  (take-while #(< % x) (fib-sequence)))

(defn euler002 [x]
  (reduce + (filter even? (fib-less-than x))))

(defn solution []
  (euler002 4000000))
