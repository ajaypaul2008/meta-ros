DESCRIPTION = "A ros package that includes plugins and nodes to convert occupied costmap2d cells to primitive types."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs roscpp std-msgs costmap-2d dynamic-reconfigure pluginlib cv-bridge"

SRC_URI = "https://github.com/rst-tu-dortmund/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "13dc6165b792991b9c78ab1df221f91d"
SRC_URI[sha256sum] = "d49c374a6ca9a12c3ae7b5a8b9b74063b5674da71d140db1b4790da036ff2826"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

ROS_SPN = "costmap_converter"
