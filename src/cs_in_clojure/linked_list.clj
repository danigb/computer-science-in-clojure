(ns cs-in-clojure.linked-list)

(deftype Node [value prev next])
(deftype LinkedList [first last size])

(defn empty []
  (LinkedList. nil nil 0))

(defn head [list]
  (.value (.first list)))

(defn append [list value]
  (let [last (Node. value (.last list) nil)]
    (LinkedList. (.first list) last (inc (.size list)))))
