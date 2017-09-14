package com.czg.xunlei.viewholder;

import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

import com.czg.xunlei.R;
import com.czg.xunlei.base.BaseViewHolder;
import com.czg.xunlei.model.ThumbModel;
import com.czg.xunlei.utils.ImageLoader;
import com.czg.xunlei.widget.RatioImageView;

import butterknife.Bind;

/**
 * @author ：czg
 * @class ：ThumViewHolder.class
 * @date ：2017/9/14.
 * @describe ：TODO(input describe)
 */
public class ThumbViewHolder extends BaseViewHolder<ThumbModel> {

    @Bind(R.id.tv_search_id)
    TextView mTvSearchId;
    @Bind(R.id.tv_image)
    RatioImageView mTvImage;
    @Bind(R.id.tv_title)
    TextView mTvTitle;

    public ThumbViewHolder(ViewGroup viewGroup, int layoutId) {
        super(viewGroup, layoutId);
    }

    @Override
    public void setData(ThumbModel data) {
        mTvSearchId.setText(data.getTitle());
        mTvImage.setRatio(data.getRatio());
        Log.e("img",data.getImage());
        ImageLoader.setImage(mTvImage, data.getImage());
        mTvTitle.setText(data.getTitle());

    }
}