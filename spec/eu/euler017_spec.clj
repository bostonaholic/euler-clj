(ns eu.euler017-spec
  (:use speclj.core
        eu.euler017))

(describe "Project Euler problem 17"
          (it "returns the word length for simple numbers"
              (should= 0 (word-length 0))
              (should= 3 (word-length 1))
              (should= 4 (word-length 4))
              (should= 7 (word-length 16))
              (should= 8 (word-length 19)))
          (it "returns the word lenth for number with tens"
              (should= 6 (word-length 20))
              (should= 9 (word-length 21))
              (should= 10 (word-length 72)))
          (it "returns the word length for number in the hundreds"
              (should= 10 (word-length 100))
              (should= 16 (word-length 102))
              (should= 23 (word-length 342))
              (should= 25 (word-length 753)))
          (it "returns the word length for number in the thousands"
              (should= 16 (word-length 1007))
              (should= 11 (word-length 1000))
              (should= 32 (word-length 1119))))
