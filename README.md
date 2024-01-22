# quil-templates

Leiningen templates for [Quil](https://github.com/quil/quil).

There are 2 templates:

* Quil on Clojure
* Quil on ClojureScript

## Usage

To create a new quil project, run the following commands:

`lein new quil my-project` - Quil on Clojure  
`lein new quil-cljs my-project` - Quil on ClojureScript

To run your Clojure project:

`lein run`

Make sure to replace `my-project` with a cool name for your project.

## Caveats

The released `quil` template is using [quil v4.3.1563](https://github.com/quil/quil/releases/tag/v4.3.1563). However, the `quil-cljs` template was released under a Clojars group that is currently inaccessible, so the released version is still using the quil 3.1.0 release. It's possible to install and use the latest template by executing the following from a local checkout of this repository:

```
cd cljs
lein install
lein new quil-cljs my-project
```

Alternatively, the [quil/sketchbook-template](https://github.com/quil/sketchbook-template) contains a working CLJS template using the [deps-new](https://github.com/seancorfield/deps-new) template system.

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
