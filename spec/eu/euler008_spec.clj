(ns eu.euler008-spec
  (:use speclj.core
        eu.euler008))

(describe "Project Euler problem 8"

  (it "should create a collection of consecutive digits"
    (should= '(2 5) (digits-to-collection 25))
    (should= '(2 5 7 9 0) (digits-to-collection 25790)))

  (it "should find a slices of n digits"
    (should= '((2) (5)) (n-consecutive-digits 1 25))
    (should= '((2 5)) (n-consecutive-digits 2 25))
    (should= '((2 5) (5 6)) (n-consecutive-digits 2 256)))

  (it "should multiply the inner collections"
    (should= '(2 5) (product-of-inner-collections '((2) (5))))
    (should= '(10) (product-of-inner-collections '((2 5))))
    (should= '(10 30) (product-of-inner-collections '((2 5) (5 6)))))

  (it "should find the greatest product of n consecutive digits"
    (should= 5 (euler008 1 25))
    (should= 25 (euler008 2 55))
    (should= 10 (euler008 2 25))
    (should= 30 (euler008 2 256))))

