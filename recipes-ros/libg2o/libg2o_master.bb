DESCRIPTION = "The libg2o library from http://openslam.org/g2o.html"

SECTION = "libs"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://doc/license-bsd.txt;md5=e13cdf725d5222ff128c0173bb15c328"

DEPENDS = "catkin boost libeigen"

S = "${WORKDIR}/git"

SRC_URI = "git://github.com/RainerKuemmerle/g2o.git;branch=master;protocol=git \
           file://001-disable-sse-for-ARM.patch"
SRC_URI[md5sum] = "b6e9c98e65e19686b67c90180f7829e6"
SRCREV = "${AUTOREV}"

FILES_${PN} += "${libdir}/*"
 
inherit cmake
