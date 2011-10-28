(ns eu.core)

(defn very-short? [s]
  (or (= 0 (.length s))
      (= 1 (.length s))))

(defn first-and-last-equal? [s]
  (= (first s)
     (last s)))

(defn middle [s]
  (subs s
        1
        (- (.length s) 1)))

(defn palindrome? [s]
  (cond
   (very-short? (str s))           true
   (first-and-last-equal? (str s)) (recur (middle (str s)))
    :else                          false))

