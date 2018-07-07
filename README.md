# cljobq-web-server

Standalone web frontend server for [cljobq] running [cljobq-web].

## Installation

Download from the [GitHub releases page](https://github.com/bwalex/cljobq-web-server/releases).

## Usage

```
Usage: java -jar cljobq-web-server-0.1.2-standalone.jar [options]

Options:
  -d, --database-uri URI           Database URI to connect to cljobq. Required.
  -l, --listen-ip IP      0.0.0.0  IP address to listen on
  -p, --listen-port PORT  4480     Port number
  -b, --base-url URL               Base URL under which cljobq-web is being fronted
  -h, --help
```

The database URI can either be in the standard JDBC format (see the example below) or anything understood by [to-jdbc-uri], such as: `postgres://username:password@hostname/dbname`.

Example:

```
java -jar cljobq-web-server-0.1.2-standalone.jar \
  -l 127.0.0.1 \
  -d "jdbc:postgresql://localhost:5432/dlt4?user=dlt4&password=dlt4"
```

## License

Copyright © 2018 Alex Hornung

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

[cljobq]: https://github.com/bwalex/cljobq
[cljobq-web]: https://github.com/bwalex/cljobq-web
[to-jdbc-uri]: https://github.com/pupeno/to-jdbc-uri
