# Project Euler

Solutions to [Project Euler](http://projecteuler.net/) problem set in Clojure, written by [Matthew Boston](http://matthewboston.com/) as a way to learn the language.

## Usage

1. Install [Leiningen](https://github.com/technomancy/leiningen).
2. Run `lein deps` to download the dependencies.
3. Run `lein repl` to run a Read-Eval-Print Loop.
4. Require a proper namespace for the solution (example: `(require 'eu.euler15)` for solution to problem 15).
5. Run `(ns/solution)` where `ns` is the required namespace (example: `(eu.euler15/solution)`). It should print a solution to the chosen problem.

You can also run `lein spec` to run all [speclj](https://github.com/slagyr/speclj) unit tests (this may take awhile).

## License

The MIT License

Copyright (C) 2010 Matthew Boston

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

