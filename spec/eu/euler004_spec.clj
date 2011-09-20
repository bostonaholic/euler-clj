(ns eu.euler004-spec
  (:use [eu.euler004]
        [speclj.core]))

(describe "Project Euler problem 4"

  (it "should find the list of palidromes of products"
    (should= '(1 2 3 4 5 6 8 9) (palindromes-from-product 1 5)))

  (it "should find the greatest palindrome of products"
    (should= 9 (euler004 1 5))
    (should= 9009 (euler004 10 99))
    (should= 906609 (euler004 100 999))))
