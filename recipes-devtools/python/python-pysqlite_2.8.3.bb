SUMMARY = "DB-API 2.0 interface for SQLite 3.x"
DESCRIPTION = "pysqlite is an interface to the SQLite 3.x embedded relational \
database engine. It is almost fully compliant with the Python database API \
version 2.0 also exposes the unique features of SQLite."
HOMEPAGE = "http://github.com/ghaering/pysqlite"
LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://LICENSE;md5=28ad4f115e06c88bd737372a453369d8"

SRC_URI[md5sum] = "033f17b8644577715aee55e8832ac9fc"
SRC_URI[sha256sum] = "17d3335863e8cf8392eea71add33dab3f96d060666fe68ab7382469d307f4490"

inherit pypi setuptools

DEPENDS += "${PYTHON_PN}-pip"

RDEPENDS_${PN}_class-target += "\
    ${PYTHON_PN}-datetime \
    sqlite3 \
"

FILES_${PN}-doc += "${datadir}"
