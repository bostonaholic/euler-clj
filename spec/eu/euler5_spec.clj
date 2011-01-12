(ns eu.euler5
  (:use [eu.euler5]
        [speclj.core]))

(describe "Project Euler problem 5"
  
  (it "should find the least common multiple of a collection"
    (should= 2520 (euler5 10))
    (should= 27720 (euler5 11))
    (should= 27720 (euler5 12))
    (should= 360360 (euler5 13))
    (should= 360360 (euler5 14))
    (should= 360360 (euler5 15))
    (should= 720720 (euler5 16))
    (should= 12252240 (euler5 17))
    (should= 12252240 (euler5 18))
    (should= 232792560 (euler5 19))
    (should= 232792560 (euler5 20))))
