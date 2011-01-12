(ns eu.core)

(defn divisible? [x, divisor]
  (= 0 (rem x divisor)))

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

(defn square [x]
  (* x x))

(defn seq-upto [n]
  (take n (iterate inc 1)))

(defn loop-factors [x r]
  (for [i r
        :when (divisible? x i)]
    i))

(defn factors [x]
  (cond
    (and (not (= x 2)) (even? x))
      (cons 2 (loop-factors x (range 3 (+ 1 (/ x 2)))))
    (and (not (= x 3)) (divisible? x 3))
      (cons 3 (loop-factors x (range 4 (+ 2 (Math/sqrt x)))))
    :else
      (loop-factors x (range 3 (+ 1 (Math/sqrt x))))))

(defn no-factors? [x]
  (= '() (factors x)))

(defn prime? [x]
  (cond
    (or (= x 2)
        (= x 3))
      true
    (or (< x 2)
        (even? x))
      false
    :else (no-factors? x)))

(defn prime-factors [x]
  (filter prime? (factors x)))

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

(defn least [coll]
  (first (sort coll)))

(defn largest [coll]
  (last (sort coll)))

(defn common-multiples [a b]
  (distinct (remove nil?
    (for [i (range 1 (+ 1 (* a b)))]
      (if (and (divisible? i a)
               (divisible? i b))
        i)))))

(defn lcm [a b]
  (least (common-multiples a b)))
