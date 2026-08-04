(ns gol.core-test
  (:require [clojure.test :refer :all]
            [gol.core :refer :all]))

(deftest a-test
  (testing "foo prints a greeting"
    (is (= nil (foo "test")))))
