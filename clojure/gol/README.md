# Clojure

Skeleton project for Clojure — a Game of Life starting point.

## Prerequisites

The toolchain this project needs is declared in [`.tool-versions`](./.tool-versions):

```
java corretto-21
leiningen 2.12
```

Install those however you prefer, as long as they end up on your `PATH`. The quickest route is
[mise](https://mise.jdx.dev/), which reads the file for you:

```sh
mise install
```

## Usage

- `./script/setup` to check the toolchain is available and fetch dependencies
- `./script/test` to run the tests
- `./script/start` to run the app

## Structure

- Code located in [`src/gol/core.clj`](./src/gol/core.clj)
- Tests located in [`test/gol/core_test.clj`](./test/gol/core_test.clj)

However, you're free to organise your code as you like.
