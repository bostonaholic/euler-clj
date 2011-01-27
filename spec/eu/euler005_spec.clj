(ns eu.euler005
  (:use [eu.euler005]
        [speclj.core]))

(describe "Project Euler problem 5"
  
  (it "should find the least common multiple of a collection"
    (should= 6 (euler005 3))
    (should= 2520 (euler005 10))))
    ;;(should= 27720 (euler005 11))
    ;;(should= 27720 (euler005 12))
    ;;(should= 360360 (euler005 13))
    ;;(should= 360360 (euler005 14))
    ;;(should= 360360 (euler005 15))
    ;;(should= 720720 (euler005 16))
    ;;(should= 12252240 (euler005 17))
    ;;(should= 12252240 (euler005 18))
    ;;(should= 232792560 (euler005 19))
    ;;(should= 232792560 (euler005 20))))
