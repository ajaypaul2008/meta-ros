DESCRIPTION = "The rplidar ros package, support rplidar A2/A1 and A3"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rosconsole sensor-msgs std-srvs"

SRC_URI = "https://github.com/robopeak/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "752b85bd59986dc477b5684b819335cc"
SRC_URI[sha256sum] = "fbcaa51a56039f7dea61f80181ad7b6f6d85a0cb080b54f131068479cb791320"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
