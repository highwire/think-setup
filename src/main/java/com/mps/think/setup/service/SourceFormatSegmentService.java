package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.SourceFormatSegment;
import com.mps.think.setup.vo.SourceFormatSegmentVo;

public interface SourceFormatSegmentService {

	public List<SourceFormatSegment> findAllSourceFormatSegment();

	public SourceFormatSegmentVo saveSourceFormatSegment(SourceFormatSegmentVo sourceFormatSegmentVo);

	public SourceFormatSegmentVo updateSourceFormatSegment(SourceFormatSegmentVo sourceFormatSegmentVo);

	public SourceFormatSegment findbySourceFormatSegmentId(Integer sourceFormatSegmentId);

}
