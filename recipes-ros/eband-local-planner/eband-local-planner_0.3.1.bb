DESCRIPTION = "eband_local_planner implements a plugin to the \
    base_local_planner. It implements the Elastic Band method on the \
    SE2 manifold."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "base-local-planner control-toolbox cmake-modules costmap-2d dynamic-reconfigure geometry-msgs nav-core nav-msgs pluginlib roscpp tf tf-conversions"

SRC_URI = "https://github.com/utexas-bwi/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9f539783dede40ac4845d206a9e0fb5e"
SRC_URI[sha256sum] = "76082509fa30afe65d4757ba80f0cfcdf71ac6d550c4de1c3caf108a88183cdb"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

ROS_SPN = "eband_local_planner"
