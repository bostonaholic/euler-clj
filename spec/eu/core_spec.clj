(ns eu.core
  (:use [eu.core]
        [speclj.core]))

(describe "Project Euler eu.core tests"

  (it "should detect very short strings"
    (should (very-short-string? "1"))
    (should (very-short-string? "")))

  (it "should detect string of greater than length 3 to not be short"
    (should-not (very-short-string? "123")))

  (it "should detect when the first and last characters are equal"
    (should (first-and-last-equal? "11")))

  (it "should recognize a palindrome"
    (should (palindrome? 1))
    (should-not (palindrome? 12))
    (should (palindrome? 121))
    (should (palindrome? 12321))
    (should (palindrome? 1221))
    (should (palindrome? "gohangasalamiimalasagnahog"))
    (should-not (palindrome? 122334533221))))

