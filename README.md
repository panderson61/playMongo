# playmongo [![Codacy Badge](https://api.codacy.com/project/badge/Grade/f05aef8bb00f4faba5c09bc9e8c331cc)](https://www.codacy.com?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=picsauditing/playmongo&amp;utm_campaign=Badge_Grade) [![Build Status](https://travis-ci.com/picsauditing/playmongo.svg?token=iSq4u2yvA3L5ZuqpQpbM&branch=nightly)](https://travis-ci.com/picsauditing/playmongo)

Project to create a small bare-bones build for an Avetta Supported Play 2.76.x project with basic health and version endpoints

## Getting Started

To run the application locally using `sbt`

```scala
sbt run
```

From there you can see the main endpoint page by hitting

```bash
localhost:9000
```

You may also want to use an IDE like IntelliJ to run it as well

## Docker Support

Running the following with create and run a docker container


```bash
make
```

This will build the docker container and run it securely on port `9443`

From there you can see the main endpoint page by hitting

```bash
curl localhost:9443
```
