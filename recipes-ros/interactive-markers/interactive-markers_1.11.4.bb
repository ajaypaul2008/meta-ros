DESCRIPTION = "3D interactive marker communication library for RViz and similar tools."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "rosconsole roscpp rospy rostest std-msgs tf visualization-msgs"

SRC_URI = "https://github.com/ros-visualization/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d9089a36ddc84c7aeb72e275db480dcf"
SRC_URI[sha256sum] = "33319252510cae10a8a2e2af5ac104f33ebb0b2f5ae8d9ab9649b5dc9ee34a7a"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

