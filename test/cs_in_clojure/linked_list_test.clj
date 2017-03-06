(ns cs-in-clojure.linked-list-test
  (:require [clojure.test :refer :all]
            [cs-in-clojure.linked-list :refer :all]))

(deftest linked-list-test
  (testing "append"
    (let [list (append (empty) "value")]
      (is (= "value" (head list))))))
