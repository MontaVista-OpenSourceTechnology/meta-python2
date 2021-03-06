SUMMARY =  "Web APIs for Django, made easy."
DESCRIPTION = "Django REST framework is a powerful and flexible toolkit for building Web APIs."
HOMEPAGE = "https://www.django-rest-framework.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7879a5a716147a784f7e524c9cf103c1"

SRC_URI[md5sum] = "0d481bf8dbb87bb927b46798edc1a9bd"
SRC_URI[sha256sum] = "607865b0bb1598b153793892101d881466bd5a991de12bd6229abb18b1c86136"

PYPI_PACKAGE = "djangorestframework"

inherit pypi setuptools

RDEPENDS_${PN} += "\
    ${PYTHON_PN}-django \
"
