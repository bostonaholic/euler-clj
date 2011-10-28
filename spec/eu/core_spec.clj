(ns eu.core-spec
  (:use speclj.core
        eu.core))

(describe "Project Euler core"

  (it "should detect very shortness "
    (should (very-short? ""))
    (should (very-short? "1"))
    (should-not (very-short? "12")))

  (it "should detect when the first and last are equal"
    (should (first-and-last-equal? "11")))

  (it "returns the middle"
    (should= "sd" (middle "asdf"))
    (should= "" (middle "as")))

  (it "should recognize a palindrome"
    (should (palindrome? 1))
    (should-not (palindrome? 12))
    (should (palindrome? 121))
    (should (palindrome? 12321))
    (should (palindrome? 1221))
    (should (palindrome? "gohangasalamiimalasagnahog"))
    (should-not (palindrome? 122334533221))))

