(ns eu.euler017)

(def decas ["" "" "twenty" "thirty" "forty" "fifty" "sixty" "seventy" "eighty" "ninety"])

(def first-twenty ["" "one" "two" "three" "four" "five"
                   "six" "seven" "eight" "nine" "ten"
                   "eleven" "twelve" "thirteen" "fourteen" "fifteen"
                   "sixteen" "seventeen" "eighteen" "nineteen"])

(defn count-lookup [coll number]
  (count (nth coll number)))

(defn tens [n] (quot n 10))
(defn hundreds [n] (quot n 100))
(defn thousands [n] (quot n 1000))

(defn word-length [number]
  (cond (< number 20)
        (count-lookup first-twenty number)
        (< number 100)
        (let [tens (tens number)
              tens-count (count-lookup decas tens)
              remainder (rem number 10)
              remainder-count (word-length remainder)]
          (+ tens-count remainder-count))
        (< number 1000)
        (let [hundreds (hundreds number)
              hundreds-count (word-length hundreds)
              remainder (rem number 100)]
          (+ hundreds-count (count "hundred")
             (if-not (zero? remainder) (+ (count "and") (word-length remainder)) 0)))
        :else
        (let [thousands (thousands number)
              thousands-count (word-length thousands)
              remainder (rem number 1000)]
          (+ thousands-count (count "thousand") (word-length remainder)))))

(defn euler017 [start end]
  (apply + (map word-length (range start end))))

(defn solution []
  (euler017 1 1001))
