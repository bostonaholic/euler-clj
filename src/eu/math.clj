(ns eu.math
  (:use clojure.set))

(defn iota [t nxt stop y]
  (take-while stop (iterate #(t (nxt %)) y)))

(def upto
  "returns a sequence from start up to end"
  (fn [start end]
    (iota identity inc #(< % end) start)))

(def downto
  "returns a sequence from start down to end"
  (fn [start end]
    (iota identity dec #(> % end) start)))

(defn to
  "returns a sequence from start to end. start is 1 if not passed"
  ([end]
     (to 1 end))
  ([start end]
     (if (<= start end)
        (upto start end)
        (downto start end))))

;(to 10 20)
;(to 20 10)
;(to 5 -5)
;(to 10)

(defn divisible? [x divisor]
  "returns whether or not x is evenly divisble by divisor"
  (zero? (rem x divisor)))

(defn square [x]
  "returns x to the second power"
  (* x x))

(defn cube [x]
  "returns x to the third power"
  (* x x x))

(defn exp [x n]
  "returns x to the power of n"
  (loop [total 1
         counter n]
    (if (= counter 0)
      total
      (recur (* x total) (dec counter)))))

(defn least [coll]
  "returns the smallest element"
  (apply min coll))

(defn greatest [coll]
  "returns the largest element"
  (apply max coll))

(defn multiples [x]
  "retuns a lazy-seq of all the multiples of x"
  (filter #(divisible? % x) (iterate inc 1)))

(defn common [a b]
  "returns the common elements of a and b"
  (lazy-seq (intersection (set a)
                          (set b))))

(defn common-multiples [a b]
  "returns the common multiples of the two numbers"
  (common (take-while #(<= % (* a b)) (multiples a))
          (take-while #(<= % (* a b)) (multiples b))))

(defn lcm [a b]
  "least common multiple"
  (least (common-multiples a b)))

(defn factors-seq [x rang]
  "returns all the factors of x in a range"
  (for [i rang
        :when (divisible? x i)]
    i))

(defn factors [x]
  "returns all the factors of x"
  (cond
    (and (not (= x 2)) (even? x))
      (cons 2 (factors-seq x (range 3 (+ 1 (/ x 2)))))
    (and (not (= x 3)) (divisible? x 3))
      (cons 3 (factors-seq x (range 4 (+ 2 (Math/sqrt x)))))
    :else
      (factors-seq x (range 3 (+ 1 (Math/sqrt x))))))

(defn no-factors? [x]
  "returns whether or not x has any factors"
  (not-any? #(zero? (rem x %))
            (factors x)))

(defn product-of-collection [coll]
  "returns the result of multiplying by folding left"
  (reduce * coll))