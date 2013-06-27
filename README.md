# ChlorineJs User Contributions library

The user contributions library is a collection of features that are
potential to go into the official core-cl2 library.

[![Master branch Build Status](https://travis-ci.org/chlorinejs/cl2-contrib.png?branch=master)](https://travis-ci.org/chlorinejs/cl2-contrib)
[![Develop branch Build Status](https://travis-ci.org/chlorinejs/cl2-contrib.png?branch=develop)](https://travis-ci.org/chlorinejs/cl2-contrib)

# Consume this package

You need Java, NodeJS installed.

Pull contrib-cl2 to your machine:
```
npm install contrib-cl2
```
Load the source file you want as normal. For example you want to load concurrency.cl2:
```clojure
(load-file "./path/to/node_modules/src/concurrency.cl2")
```

# Develop
Ensure you have  installed Java and NPM. Starts watcher by typing:
```bash
cd test_runners
npm install
npm run-script watch
```
open an other terminal to run the test
```
npm run-script livetest
```
Other tasks can be found in `package.json`.
# License

Copyright © 2013 Hoang Minh Thang and various contributors.

FIXME library may be used under the terms of either the [GNU Lesser General Public License (LGPL)](http://www.gnu.org/copyleft/lesser.html) or the [Eclipse Public License (EPL)](http://www.eclipse.org/legal/epl-v10.html). As a recipient of FIXME, you may choose which license to receive the code under.
