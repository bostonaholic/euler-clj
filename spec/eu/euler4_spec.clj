(ns eu.euler4
  (:use [eu.euler4]
        [speclj.core]))

(describe "Project Euler problem 4"
 
  (it "should find the list of palidromes of products"
    (should= '(1 2 3 4 5 2 4 6 8 3 6 9 4 8 5) (palindromes-from-product 5 5)))
  
  (it "should find the largest palindrome of products"
    (should= 9 (euler4 5 5))
    (should= 9009 (euler4 99 99))
    (should= 906609 (euler4 999 999))))
