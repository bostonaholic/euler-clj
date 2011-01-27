(ns eu.core
  (:use [eu.core]
        [speclj.core]))

(describe "Project Euler eu.core tests"

  (it "should recognize a palindrome"
    (should (palindrome? 1))
    (should-not (palindrome? 12))
    (should (palindrome? 121))
    (should (palindrome? 12321))
    (should (palindrome? 1221))
    (should (palindrome? "gohangasalamiimalasagnahog"))
    (should-not (palindrome? 122334533221))))

