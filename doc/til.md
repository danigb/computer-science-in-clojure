# Clojure things I learn

In reverse order: latest first.

## Datatypes

https://clojure.org/reference/datatypes

- deftype and defrecord dynamically generate compiled bytecode for a named class
- They are similar to defstruct in generating data structures with named fields
- deftype provides no functionality not specified by the user, other than a constructor
- deftype supports mutable fields, defrecord does not
- defrecord provides a complete implementation of a persistent map

## Atom clojure setup

https://gist.github.com/jasongilman/d1f70507bed021b48625
