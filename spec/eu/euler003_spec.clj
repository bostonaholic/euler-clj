(ns eu.euler003-spec
  (:use speclj.core
        eu.euler003))

(describe "Project Euler problem 3"

  (it "should find the greatest prime factor of 600851475143"
    (should= 6857 (euler003 600851475143))))
