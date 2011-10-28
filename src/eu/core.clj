(ns eu.core)

(defn very-short-string? [s]
  (or (= 0 (.length s))
      (= 1 (.length s))))

(defn first-and-last-equal? [s]
  ;((= first last) (str s)))
  (= (first (str s))
     (last (str s))))

(defn middle [s]
  (subs (str s)
        1
        (- (.length (str s)) 1)))

(defn palindrome? [s]
  (cond
    (very-short-string? (str s)) true
    (first-and-last-equal? s)    (recur (middle s))
    :else                        false))

